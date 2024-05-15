package animal;

public class Review04 {

    public static void main(String[] args) {
        /*Humanクラスのインスタンスを3つ作成してください
        それぞれ、変数名は tanaka・suzuki・sato とします
        名前・年齢・趣味の各情報は、コンストラクタで初期化するようにしてください
        それぞれ、以下のように初期値を設定してください
        変数  名前  年齢  趣味
        tanaka  田中 太郎   25  電車
        suzuki  鈴木 次郎   30  野球
        sato    佐藤 花子   20  映画
        この3人の各インスタンスで say と think メソッドを実行するようにしてください
        各 say と think メソッドの実行順序は、下記の実行結果になるように並べてください*/
        Human tanaka = new Human("田中 太郎", 25, "電車");
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        Human sato = new Human("佐藤 花子", 20, "映画");

        // say
        tanaka.say();
        // think
        tanaka.think();

        // say
        suzuki.say();
        // think
        suzuki.think();

        // say
        sato.say();
        // think
        sato.think();
    }

}
