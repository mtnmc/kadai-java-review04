package animal;


/*Javaではスーパークラスの継承とインターフェイスの実装を両方同時に指定できます。
 * Humanクラスは、Animal クラスを継承し、Thinkable インターフェイスを実装するようにしてください*/
public class Human extends Animal implements Thinkable {

    // フィールド 趣味の情報を保管するフィールドを定義してください。変数名は自由とします。
    //カプセル化を使ってください
    private String hobby;//　趣味

     /*コンストラクタで名前・年齢・趣味の情報を格納する引数を設定し、処理内容として名前・
     年齢・趣味の各変数を引数の情報で初期化するようにしてください。引数の名前は自由とします。
     名前と年齢の初期化については、スーパークラス（Animal）のコンストラクタを利用するようにしてください*/

    // 引数なしのコンストラクタ（念のため記述）
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラス(Animal)のコンストラクターを呼び出し
        this.hobby = hobby;
    }

    public void say() {
        System.out.println(super.getName() + "です。" + super.getAge() + "歳です。");
}

     /*think メソッドを実装してください。このメソッドは、趣味のフィールドに入っている文字列の中身を利用して、
     私は□□について考えています。 と画面に System.out.println() で表示するような処理としてください*/
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
}

//hobbyのget setはいらない？？


}
