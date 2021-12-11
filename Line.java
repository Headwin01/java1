package tasks.task310;

public class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void addToANum(double num){
        a += num;
    }

    public void reduceANum(double num){
        a -= num;
    }

    public void divideAByNum(double num) {
        a/=num;
    }

    public void multiplyAinNum(double num) {
        a*= num;
    }

    public String getPointIntersectionWithX() {
        return String.format("x = %.2f, y = 0;", (double) -this.c / (double) this.a);
    }

    public String getPointIntersectionWithY() {
        return String.format("x = 0, y = %.2f;", (double) -this.c / (double) this.b);
    }

    public String getPointIntersectionLines(Line line) {
        String result = null;
        if (line != null) {
            double coeffOne = (double) this.a / (double) line.a;
            double coeffTwo = (double) this.b / (double) line.b;
            double coeffThree = (double) this.c / (double) line.c;

            if (coeffOne == coeffTwo && coeffOne == coeffThree) {
                result = "Прямые равны. Имеют бесконечное множество точек пересечения.";
            } else if (coeffOne == coeffTwo && coeffOne != coeffThree) {
                result = "Прямые параллельны. Точек пересечения нет.";
            } else {
                double y = (double) (line.a * this.c - this.a * line.c) / (double) (this.a * line.b - line.a * this.b);
                double x = (this.b * y + this.c) / (double) -this.a;
                result = String.format("Точка пересечения: {%.2f, %.2f};", x, y);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = getBlock(this.a, "x", true);
        result = result.concat(getBlock(this.b, "y", this.a == 0));
        result = result.concat(getBlock(this.c, "", this.a == 0 && this.b == 0));
        return result.concat(" = 0");
    }

    private String getBlock(int number, String prefix, boolean first) {
        String result = "";
        if (number != 0) {
            if (first) {
                result = String.format("%d%s", number, prefix);
            } else {
                String sign = number < 0 ? "-" : "+";
                result = String.format(" %s %d%s", sign, Math.abs(number), prefix);
            }
        }
        return result;
    }
}
