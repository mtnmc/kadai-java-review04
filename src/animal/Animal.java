package animal;



public class Animal {

    /*名前を格納するフィールドと年齢を格納するフィールドを定義してください（苗字と名前は分けなくてOKです）
    変数名は自由としますカプセル化を使ってください*/

    // フィールド
    private String name; // 名前
    private int age; // 年齢

    /*コンストラクタに名前・年齢の情報を格納する引数を設定し、処理内容として名前・年齢の各フィールドを引数の情報で初期化するようにしてください
    引数の名前は自由とします*/
    // 引数なしのコンストラクタ（念のため記述）
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*say という名前のpublicなメソッドを定義してください。このメソッドを実行すると、フィールドに代入された
     * 名前と年齢を使って ○○です。△△歳です。 と画面に System.out.println() で表示するように
     * 処理を作りましょう（戻り値の指定は不要です）*/

    public void say(String name, int age) {
            System.out.println(this.name + "です。" + this.age + "歳です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
