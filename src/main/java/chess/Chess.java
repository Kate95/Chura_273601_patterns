package chess;

public abstract class Chess {

    protected String name;
    protected int size;
    protected String material;

    public abstract void cut();

    public void paint() {
        System.out.println("Half figures paint white paint, the other half - black.");
    }

    public void varnish() {
        System.out.println("Varnish figures.");
    }

    public void dry() {
        System.out.println("Dry figures.");
    }

    public void box() {
        System.out.println("Pack chess in the box.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String str = "Name: " + name + "\nSize: " + size + "cm\nMaterial: " + material;
        return str;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + size;
        result = result * prime + material.length();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Chess temp = (Chess)obj;
        if((this.name.equals(temp.name))&&(this.size==temp.size)&&(this.material.equals(temp.material))){
            return true;
        }
        return false;
    }
}
