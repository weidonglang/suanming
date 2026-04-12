package com.example.demo.oracle;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FortuneService {

    private final Random random = new Random();

    private final List<Fortune> fortunes = List.of(
            new Fortune("宇宙摸鱼许可证", "今天最适合把复杂问题先放进抽屉，等灵感自己长腿回来找你。", "松弛", "遇事先喝水，再假装自己胸有成竹。", 18, "#8bf18b", "系统检测到你有 87% 概率优雅划水。"),
            new Fortune("代码召唤阵", "你写下的下一段代码会一次跑通，但代价是你会对它产生不合理的感情。", "亢奋", "提交前别庆祝，先看一眼边界条件。", 41, "#7dd3fc", "编译器眨了一下眼。"),
            new Fortune("会议迷宫", "你可能会进入一场没有结论的讨论，不过你会靠一句人话终结它。", "烦躁", "当所有人开始空话时，直接问结论和截止时间。", 62, "#f9a8d4", "空气中检测到 PPT 颗粒物。"),
            new Fortune("深夜战神模式", "今晚脑子会突然异常清醒，像被外星人偷偷升级过缓存。", "锋利", "趁状态好先处理最难的那件事。", 53, "#facc15", "你的 CPU 温度来自纯粹的求知欲。"),
            new Fortune("幸运暴击", "一个你以为没戏的机会会突然回头找你，像剧情编剧临时改了稿。", "狂喜", "别先怀疑人生，先回复消息。", 27, "#c4b5fd", "现实世界出现轻微掉帧。"),
            new Fortune("混沌观测者", "今天不适合追求完全掌控，适合把混乱整理成可执行的两步。", "冷静", "列清单只留最前面的 2 项，别假装自己有 14 个优先级。", 35, "#fb7185", "命运引擎拒绝提供完整版剧透。"),
            new Fortune("社交闪避大师", "有人想把压力传染给你，但你会像游戏角色一样精准翻滚躲开。", "机警", "礼貌是礼貌，接锅是接锅，别混了。", 58, "#fdba74", "检测到无效甩锅，已自动反弹。"),
            new Fortune("神秘大吉", "一个很小的念头会长成今天最有意思的成果，前提是你立刻开始。", "明亮", "别等完美开场，先做个荒谬原型。", 22, "#86efac", "平行宇宙投来赞许目光。")
    );

    public Fortune reveal() {
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
