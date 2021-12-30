import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="CalcInterest" width=250 height=150>
</applet>
*/
public class CalcInterest extends Applet implements ActionListener {
    Double fin, inter, prin, rate, year;
    String str, str1 = "";
    Label pri, nof, roi, f, i;
    TextField p, n, r, f1, i1;
    Button calc_i, calc_f;
    public void init() {
        pri = new Label("PRINCIPAL:", Label.CENTER);
        nof = new Label("NO OF YEARS", Label.CENTER);
        roi = new Label("RATE OF INTEREST", Label.CENTER);
        f = new Label("FINAL AMOUNT:", Label.CENTER);
        i = new Label("INTEREST:", Label.CENTER);
        i1 = new TextField(20);
        f1 = new TextField(20);
        p = new TextField(20);
        n = new TextField(20);
        r = new TextField(20);
        calc_i = new Button("CALCULATE INTEREST");
        calc_f = new Button("CALCULATE FINAL AMOUNT");
        add(pri);
        add(p);
        add(nof);
        add(n);
        add(roi);
        add(r);
        add(i);
        add(i1);
        add(f);
        add(f1);
        add(calc_i);
        add(calc_f);
        calc_i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prin = Double.parseDouble(p.getText());
                rate = Double.parseDouble(r.getText());
                year = Double.parseDouble(n.getText());
                inter = (prin * rate * year) / 100.0;
                str = Double.toString(inter);
                i1.setText(str);
            }
        });
        calc_f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prin = Double.parseDouble(p.getText());
                rate = Double.parseDouble(r.getText());
                year = Double.parseDouble(n.getText());
                inter = (prin * rate * year) / 100.0;
                fin = prin + inter;
                str1 = Double.toString(fin);
                f1.setText(str1);
            }
        });
        f1.addActionListener(this);
        i1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {}
}
