import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator implements ActionListener {

    boolean isOperatorClicked = false;
    boolean isAddClicked = false;
    boolean isSubClicked = false;
    boolean isMulClicked = false;
    boolean isDevClicked = false;
    boolean isPrimeClicked = false;
    boolean isOddOrEven = false;
    boolean isDivisible = false;
    String oldValue;
    static String Value;

    JFrame jf;
    JLabel displayLabel;
    JButton nineButton;
    JButton eightButton;
    JButton sevenButton;
    JButton sixButton;
    JButton fiveButton;
    JButton fourButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton zeroButton;
    JButton pointButton;
    JButton signButton;
    JButton divideButton;
    JButton multiplyButton;
    JButton plusButton;
    JButton subtractButton;
    JButton equalsButton;
    JButton clearButton;
    JButton primeButton;
    JButton oddOrEvenButton;
    JButton isDivisibleOrNot;
    JButton eraseButton;

    Calculator(){
        jf = new JFrame("Calculator By Anuraj");
        jf.setLayout(null);
        jf.setSize(550, 600);
        jf.setLocation(400, 60);


        displayLabel = new JLabel();
        displayLabel.setBounds(30, 20, 500, 40);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        nineButton = new JButton("9");
        nineButton.setBounds(250, 160, 80, 80);
        jf.add(nineButton);
        nineButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(170, 160, 80, 80);
        jf.add(eightButton);
        eightButton.addActionListener(this);

        sevenButton = new JButton("7");
        sevenButton.setBounds(90, 160, 80, 80);
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(250, 240, 80, 80);
        jf.add(sixButton);
        sixButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(170, 240, 80, 80);
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(90, 240, 80, 80);
        jf.add(fourButton);
        fourButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(250, 320, 80, 80);
        jf.add(threeButton);
        threeButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(170, 320, 80, 80);
        jf.add(twoButton);
        twoButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(90, 320, 80, 80);
        jf.add(oneButton);
        oneButton.addActionListener(this);

        pointButton = new JButton(".");
        pointButton.setBounds(250, 400, 80, 80);
        jf.add(pointButton);
        pointButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setBounds(170, 400, 80, 80);
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        signButton = new JButton("+/-");
        signButton.setBounds(90, 400, 80, 80);
        jf.add(signButton);
        signButton.addActionListener(this);

        divideButton = new JButton("÷");
        divideButton.setBounds(330, 80, 80, 80);
        jf.add(divideButton);
        divideButton.addActionListener(this);

        multiplyButton = new JButton("X");
        multiplyButton.setBounds(330, 160, 80, 80);
        jf.add(multiplyButton);
        multiplyButton.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 320, 80, 80);
        jf.add(plusButton);
        plusButton.addActionListener(this);

        subtractButton = new JButton("-");
        subtractButton.setBounds(330, 240, 80, 80);
        jf.add(subtractButton);
        subtractButton.addActionListener(this);

        equalsButton = new JButton("=");
        equalsButton.setBounds(330, 400, 80, 80);
        jf.add(equalsButton);
        equalsButton.setBackground(Color.black);
        equalsButton.setForeground(Color.WHITE);
        equalsButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.setBounds(410, 160, 102, 80);
        jf.add(clearButton);
        clearButton.addActionListener(this);

        eraseButton = new JButton("⌫");
        eraseButton.setBounds(410, 80, 102, 80);
        jf.add(eraseButton);
        eraseButton.addActionListener(this);

        primeButton = new JButton("isPrime");
        primeButton.setBounds(410, 400, 102, 80);
        jf.add(primeButton);
        primeButton.setForeground(Color.RED);
        primeButton.addActionListener(this);

        oddOrEvenButton = new JButton("OddOrEven");
        oddOrEvenButton.setBounds(410, 240, 102, 80);
        jf.add(oddOrEvenButton);
        oddOrEvenButton.setForeground(Color.RED);
        oddOrEvenButton.addActionListener(this);

        isDivisibleOrNot = new JButton("Divisible");
        isDivisibleOrNot.setBounds(410, 320, 102, 80);
        jf.add(isDivisibleOrNot);
        isDivisibleOrNot.setForeground(Color.RED);
        isDivisibleOrNot.addActionListener(this);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] calc){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //jf.getContentPane().setBackground(Color.GREEN);
        if(e.getSource() == nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }else if(e.getSource() == eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        }else if(e.getSource() == sevenButton){
                    if(isOperatorClicked){
                        displayLabel.setText("7");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"7");
                    }
        }else if(e.getSource() == sixButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("6");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"6");
                    }
        }else if(e.getSource() == fiveButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("5");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"5");
                    }
        }else if(e.getSource() == fourButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("4");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"4");
                    }
        }else if(e.getSource() == threeButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("3");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"3");
                    }
        }else if(e.getSource() == twoButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("2");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"2");
                    }
        }else if(e.getSource() == oneButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("1");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"1");
                    }
        }else if(e.getSource() == zeroButton) {
                    if(isOperatorClicked){
                        displayLabel.setText("0");
                        isOperatorClicked = false;
                    }else{
                        displayLabel.setText(displayLabel.getText()+"0");
                    }
        }else if(e.getSource() == pointButton){
            displayLabel.setText(displayLabel.getText()+".");
        }else if(e.getSource() == signButton){
            displayLabel.setText(displayLabel.getText()+"-");
        }else if(e.getSource() == divideButton){
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            isDevClicked = true;

        }else if(e.getSource() == multiplyButton){
            //displayLabel.setText(displayLabel.getText()+"X");
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            isMulClicked = true;
        }else if(e.getSource() == plusButton){

            //displayLabel.setText(displayLabel.getText()+"+");
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            isAddClicked = true;


        }else if(e.getSource() == subtractButton){
            //displayLabel.setText(displayLabel.getText()+"-");
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            isSubClicked = true;
        }else if(e.getSource() == equalsButton){

            if(isAddClicked) {
                //displayLabel.setText(displayLabel.getText()+"=");
                String newValue = displayLabel.getText();
                float newValueF = Float.parseFloat(newValue);
                float oldValueF = Float.parseFloat(oldValue);
                float result = oldValueF + newValueF;
                displayLabel.setText((decimalEliminator(result + "")));
            }else if(isSubClicked){
                String newValue = displayLabel.getText();
                float newValueF = Float.parseFloat(newValue);
                float oldValueF = Float.parseFloat(oldValue);
                float result = oldValueF - newValueF;
                displayLabel.setText((decimalEliminator(result + "")));
            }else if(isMulClicked){
                String newValue = displayLabel.getText();
                float newValueF = Float.parseFloat(newValue);
                float oldValueF = Float.parseFloat(oldValue);
                float result = oldValueF * newValueF;
                displayLabel.setText((decimalEliminator(result + "")));
            }else if(isDevClicked){
                String newValue = displayLabel.getText();
                float newValueF = Float.parseFloat(newValue);
                float oldValueF = Float.parseFloat(oldValue);
                float result = oldValueF / newValueF;
                displayLabel.setText((decimalEliminator(result + "")));
            }

        }else if(e.getSource() == clearButton){
            displayLabel.setText("");
        }else if (e.getSource() == primeButton){
                String newValue = displayLabel.getText();
                float newValueF = Float.parseFloat(newValue);
                primeOrNot(newValueF);
                displayLabel.setText(Value + "");
        }else if(e.getSource() == oddOrEvenButton){
            String newValue = displayLabel.getText();
                float newValueF = Float.parseFloat(newValue);
                oddOrEven(newValueF);
                displayLabel.setText(Value + "");
        }else if(e.getSource() == isDivisibleOrNot){
            oldValue = displayLabel.getText();
                boolean result = Divisible(Integer.parseInt(oldValue));
                    if (result)
                        displayLabel.setText(displayLabel.getText() + " is divisible by it's digits");
                    else
                        displayLabel.setText(displayLabel.getText() + " is NOT divisible by it's digits");
        }else if(e.getSource() == eraseButton){
            String val = displayLabel.getText();
            displayLabel.setText(removeLastChar(val));

        }

    }
    public static void primeOrNot(float n){
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n% i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            Value = "Prime";
        }
        else{
            Value = "Not Prime";
            }
    }
    public static void oddOrEven(float n){
        if(n % 2 == 0){
            Value = "isEven";
        }else{
            Value = "isOdd";
        }
    }
    public boolean Divisible(int num){

        ArrayList<Integer> digits = getDigits(num);

        for (int x : digits) {
            if (num % x != 0)
                return false;
        }
        return true;
    }


    ArrayList<Integer> getDigits(int num){

        ArrayList<Integer> digits = new ArrayList<>();
        while (num>0){
            int x = num%10;
            num = num/10;
            digits.add(x);
        }
        return digits;
    }
    public String decimalEliminator(String x){
        String[] str = x.split("\\.");
        int temp=Integer.parseInt(str[0]);
        int temp2=Integer.parseInt(str[1]);
        if(temp2>0){
            return (x+"");
        }
        return (temp+"");

    }
    public static String removeLastChar(String str) {
        return removeLastChars(str, 1);
    }

    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }
}
