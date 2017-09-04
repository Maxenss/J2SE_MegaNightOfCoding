package android_example;

import javax.xml.soap.Text;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();
        Switch switch1 = new Switch();
        TextView textView1 = new TextView();

        workWithView((View) button1);
        workWithView((View) switch1);
        workWithView((View) textView1);
    }

    public static void workWithView(View v) {
        v.show();
    }
}
