const body = document.body;
const button = document.getElementById("fortuneButton");
const statusText = document.getElementById("statusText");
const dangerFill = document.getElementById("dangerFill");
const dangerText = document.getElementById("dangerText");
const moodBadge = document.getElementById("moodBadge");
const glitchMessage = document.getElementById("glitchMessage");
const fortuneTitle = document.getElementById("fortuneTitle");
const fortuneProphecy = document.getElementById("fortuneProphecy");
const fortuneTip = document.getElementById("fortuneTip");
const resultCard = document.getElementById("resultCard");

async function revealFortune() {
    body.classList.add("is-loading");
    statusText.textContent = "命运引擎运转中，正在偷看你今天的隐藏剧本...";
    button.disabled = true;

    try {
        const response = await fetch("/api/fortune");
        if (!response.ok) {
            throw new Error("fortune request failed");
        }

        const fortune = await response.json();
        applyFortune(fortune);
    } catch (error) {
        statusText.textContent = "宇宙信号短暂中断，请再次尝试召唤。";
        glitchMessage.textContent = "错误代码：平行宇宙未响应";
    } finally {
        body.classList.remove("is-loading");
        button.disabled = false;
    }
}

function applyFortune(fortune) {
    statusText.textContent = `已成功观测到剧情分支：${fortune.title}`;
    dangerFill.style.width = `${fortune.dangerLevel}%`;
    dangerText.textContent = `${fortune.dangerLevel}%`;
    moodBadge.textContent = fortune.mood;
    moodBadge.style.background = `${fortune.color}22`;
    moodBadge.style.color = fortune.color;
    glitchMessage.textContent = fortune.glitchMessage;
    fortuneTitle.textContent = fortune.title;
    fortuneProphecy.textContent = fortune.prophecy;
    fortuneTip.textContent = fortune.survivalTip;

    resultCard.classList.remove("pulse");
    void resultCard.offsetWidth;
    resultCard.classList.add("pulse");
}

button.addEventListener("click", revealFortune);
