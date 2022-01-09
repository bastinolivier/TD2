package ColorExo;

import java.util.List;

class Color {
    public Red r;
    public Green g;
    public Blue b;

    public Color(Red r, Green g, Blue b) {
        this.r = r; // this.r = new exo1.Red(r.getIntensity())
        this.g = g;
        this.b = b;
    }

    public Color(short a, short b, short c) {
        this.r = new Red(a);
        this.g = new Green(b);
        this.b = new Blue(c);

    }

    public void addComponent(Component component) {
        if (component instanceof Red) {
            try {
                r.add(component, component);
            } catch (ArithmeticException ex) {
                r.setIntensity((short) 255);
            }
        }
        if (component instanceof Green) {
            try {
                g.add(component, component);
            } catch (ArithmeticException ex) {
                g.setIntensity((short) 255);
            }
        }
        if (component instanceof Blue) {
            try {
                b.add(component, component);
            } catch (ArithmeticException ex) {
                b.setIntensity((short) 255);
            }
        }
    }

    public void addComponent(Component c1, Component c2, Component c3) {
        addComponent(c1);
        addComponent(c2);
        addComponent(c3);
    }

    public void subComponent(Component component) {
        if (component instanceof Red) {
            try {
                r.substract(component, component);
            } catch (ArithmeticException ex) {
                r.setIntensity((short) 255);
            }
        }
        if (component instanceof Green) {
            try {
                g.substract(component, component);
            } catch (ArithmeticException ex) {
                g.setIntensity((short) 255);
            }
        }
        if (component instanceof Blue) {
            try {
                b.substract(component, component);
            } catch (ArithmeticException ex) {
                b.setIntensity((short) 255);
            }
        }
    }

    public void subComponent(Component c1, Component c2, Component c3) {
        subComponent(c1);
        subComponent(c2);
        subComponent(c3);
    }

    public void addComponent(List<Component> components) {
        components.stream().forEach(e -> addComponent(e));
    }

    public void subComponent(List<Component> components) {
        components.stream().forEach(e -> subComponent(e));
    }

    public String print(Color color) {
        String toto = r.print();
        String tata = g.print();
        String tutu = b.print();
        System.out.print((r.print()) + (g.print()) + (b.print()));
        return null;
    }
}