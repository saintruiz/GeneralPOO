public class Androide {
    @Override
    public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }

    public static void main(String[] args) {
        Androide androide = new Androide();
        System.out.println(androide); //Se puede hacer de esta manera
        System.out.println(androide.toString()); //O invocando al método (Que técnicamente es lo mismo que imprimir el objeto)
    }
}