package Recuperacion_Eval_2_Junio_2021.Ejercicio1;

public class Montura {
    private String marca;
    private Material_Montura material_mont;
    private String color;

    public Montura(String marca, Material_Montura material_mont, String color) {
        this.marca = marca;
        this.material_mont = material_mont;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Montura{" +
                "marca='" + marca + '\'' +
                ", material_mont=" + material_mont +
                ", color='" + color + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Material_Montura getMaterial_mont() {
        return material_mont;
    }

    public void setMaterial_mont(Material_Montura material_mont) {
        this.material_mont = material_mont;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
