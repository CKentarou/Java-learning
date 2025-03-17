package ClassEnum.Month;

public enum Month {
    JANUARY("睦月", 1),
    FEBRUARY("如月", 2),
    MARCH("弥生", 3),
    APRIL("卯月", 4),
    MAY("皐月", 5),
    JUNE("水無月", 6),
    JULY("文月", 7),
    AUGUST("葉月", 8),
    SEPTEMBER("長月", 9),
    OCTOBER("神無月", 10),
    NOVEMBER("霜月", 11),
    DECEMBER("師走", 12);

    // フィールド
    private String name;   // 列挙クラス Month の名前
    private int number;    // 列挙クラス Month の番号

    // コンストラクタ
    private Month(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() { return name; }  // 名前を返す
    public int getNumber() { return number; } // 番号を返す
}
