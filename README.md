# agent_battle
エージェントの対戦ゲームです。メインの部分はJava、グラフ・動画の作成はPythonを用いています。  
Windows/macOS対応です。(Linuxは動作未確認)

<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/battle_wall.gif" alt="エージェントの動画">
</div>

## 概要
2つのエージェントがフィールド内のアイテム(報酬)を取り合うゲームです。  
各エージェントは1ステップにつき、上下左右の移動・上下左右の攻撃・何もしないのいずれかを行うことができます。  
1試合10万ステップでこれを100試合行い、獲得したアイテム(報酬)の多かったほうが勝ちです。

## 内容
### 壁のない環境での対戦 (simulation1) 
<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/battle_no_wall.png" alt="壁のない環境">
</div>

壁のない環境で勝つ戦略を考えてもらいます。  
「ActionA.java」、「ActionB.java」に各エージェントの戦略を記載してください。

### 壁のある状況での対戦 (simulation2)  
<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/battle_wall.png" alt="壁のない環境">
</div>

壁のある環境で勝つ戦略を考えてもらいます。  
「ActionA2.java」、「ActionB2.java」に各エージェントの戦略を記載してください。  
**毎回ランダムに壁が生成されます。**

## ルール
* 各エージェントはスコア0からスタートする
* 各ステップにエージェントは1マス移動するか、上下左右1方向に攻撃ができる
* 報酬があるマスに到達すれば、報酬を獲得できる（そのエージェントのスコアが1増える）
* 報酬を多く獲得したエージェントの勝利 (スコアが高いエージェントの勝ち)
* 報酬は各地点の生起確率に従い発生する  
生起確率:0.001 ,0.01 ,0.05
* 攻撃は壁を貫通する
* エージェントは攻撃を受けると5ステップフィールドから除外される
* 復帰後は3ステップ無敵
* 同一マスにいるエージェントには攻撃できない

## 環境
* マップサイズ：５×５(設定で変更可能)
* 各エージェントには、自分と相手の位置、状態（何モードか）、壁の位置、報酬の位置、各マスの報酬発生確率、自分と相手の現在のスコアの情報が与えられる
* 各エージェントは与えられた情報をもとに、上下左右移動(0～3)、上下左右攻撃(4～7)、何もしない(8)の0~8の数字から1つの数字を返す
* 復帰地点はランダムに決まる
* 同一マスにエージェントが存在できる（報酬は得られない）

## ツール
本体のプログラム (Javaで実装されている部分)だと、エージェントの動きが分かりにくいので、Pythonを使った便利なツールを用意しました。
### GraphShowing.ipynb
フィールド内の各マスのアイテムの発生しやすさの情報を表す画像を出力するプログラム（色が濃いほど発生しやすい）
<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/Graph.png" alt="各マスの報酬の発生しやすさの分布図">
</div>

### MakeAgentMovementMovie.ipynb
毎ステップのエージェントの動きとフィールドの情報を表した画像と動画を出力するプログラム
<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/battle_wall.png" alt="壁のない環境">
</div>
<br>
<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/battle_wall.gif" alt="エージェントの動画">
</div>


### MakeScoreGraph.ipynb
各エージェントのスコアの時間推移を出力するプログラム（自分で実装）
<div align="center">
<img src="https://raw.github.com/wiki/s-tsuiki/agent_battle/images/ScoreGraph.png" alt="スコアの推移のグラフ" width="500">
</div>

## 必要な環境
* Windows/macOSのPC (Linuxは動作未確認)
* Javaが実行できる環境 (Eclipseなど)
* 「Jupyter Notebook」が動く環境 (Anacondaなど)
* 画像・動画出力ツールを利用する場合は、「opencv」をインストールする必要があります
