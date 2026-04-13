
````md
# 电子玄学研究所 · suanming

一个基于 **Spring Boot 4 + Java 21 + 原生前端** 的趣味小项目。  
打开页面，点击按钮，后端就会即时生成一条“今日命运播报”——带标题、预言、求生建议、情绪标签、故障提示和风险指数。

它不是传统意义上的“严肃算命系统”，更像一个带点赛博玄学气质的随机命运生成器：  
**离谱、好玩、轻量、适合练手。**

---

## 项目特点

- **一键抽取命运**
  - 无需输入复杂信息，点击按钮即可生成结果
- **前后端一体化**
  - Spring Boot 提供静态页面和 API
- **赛博玄学 UI 风格**
  - 单页界面，视觉风格偏“电子占卜 / 平行宇宙实验室”
- **结构简单，适合学习**
  - 适合用来练习：
    - Spring Boot Web 接口
    - 静态资源托管
    - 前后端数据交互
    - 趣味项目包装与展示

---

## 效果概览

进入页面后，你会看到一个名为 **“电子玄学研究所”** 的主页。

核心交互流程：

1. 打开首页
2. 点击 **“启动今日命运引擎”**
3. 前端请求后端接口 `/api/fortune`
4. 页面展示一份新的命运播报，包括：
   - 命运标题
   - 预言文案
   - 求生建议
   - 情绪标签
   - 故障提示
   - 风险指数

---

## 技术栈

- **Java 21**
- **Spring Boot 4**
- **Gradle**
- **Spring Web MVC**
- **Lombok**
- **原生 HTML / CSS / JavaScript**
- 已引入 **MySQL Connector/J**（当前仓库中已配置依赖，后续可扩展数据库能力）

---

## 项目结构

```text
suanming
├── build.gradle
├── gradlew
├── gradlew.bat
├── src
│   ├── main
│   │   ├── java/com/example/demo
│   │   │   └── DemoApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           ├── index.html
│   │           ├── app.js
│   │           └── styles.css
│   └── test
│       └── java/com/example/demo
│           └── DemoApplicationTests.java
````

> 当前项目名称和包名还保留了初始化脚手架默认命名，例如 `demo`、`com.example.demo`，后续可以按项目主题进一步整理。

---

## 运行环境

请确保本地具备以下环境：

* **JDK 21**
* 可执行的 Gradle 环境，或者直接使用仓库自带的 **Gradle Wrapper**

---

## 启动方式

### macOS / Linux

```bash
./gradlew bootRun
```

### Windows

```bash
gradlew.bat bootRun
```

启动后默认访问：

```text
http://localhost:8080
```

---

## 页面访问

启动成功后，浏览器打开：

```text
http://localhost:8080
```

你会进入一个单页界面：

* 左侧是命运引擎区域
* 右侧是结果展示区域
* 点击按钮后即可刷新一次新的命运结果

---

## 接口说明

### `GET /api/fortune`

前端点击按钮时会调用这个接口。

#### 请求示例

```bash
curl http://localhost:8080/api/fortune
```

#### 前端依赖的返回字段

从当前前端逻辑看，接口返回 JSON 至少应包含以下字段：

```json
{
  "title": "今日命运标题",
  "prophecy": "命运预言内容",
  "survivalTip": "求生建议",
  "mood": "当前命运情绪",
  "glitchMessage": "宇宙故障提示",
  "dangerLevel": 72,
  "color": "#fb7185"
}
```

#### 字段说明

| 字段名             | 类型     | 说明              |
| --------------- | ------ | --------------- |
| `title`         | String | 本次命运的标题         |
| `prophecy`      | String | 核心预言文案          |
| `survivalTip`   | String | 对应的行动建议         |
| `mood`          | String | 命运情绪标签          |
| `glitchMessage` | String | 风格化的异常/提示信息     |
| `dangerLevel`   | Number | 风险指数，前端用于更新进度条  |
| `color`         | String | 主题颜色，前端用于更新状态徽章 |

---

## 前端实现说明

当前前端由 3 个静态文件组成：

### `index.html`

负责页面结构，包含：

* 标题区
* 状态栏
* 风险指数条
* 命运按钮
* 结果展示区

### `styles.css`

负责整体视觉样式，特点包括：

* 深色渐变背景
* 玻璃拟态面板
* 高亮状态条
* 动态按钮效果
* 移动端响应式适配

### `app.js`

负责前端交互逻辑：

* 点击按钮请求 `/api/fortune`
* 请求成功后将返回结果写入页面
* 动态更新风险指数
* 根据后端颜色值修改状态徽章样式
* 失败时显示“宇宙信号中断”类文案

---

## 项目适合用来做什么

这个项目很适合拿来做：

* Spring Boot Web 入门练手
* 课程作业 / 小作品展示
* 趣味生成类 Demo
* 前后端交互基础示例
* UI 包装能力展示
* 简历里的“轻量完整项目”

---

## 当前版本的优点

* **启动简单**
* **依赖不重**
* **页面完整**
* **有明确主题感**
* **交互闭环清晰**
* **适合继续扩展**

这是一个典型的“体量不大，但很有包装潜力”的项目。

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
