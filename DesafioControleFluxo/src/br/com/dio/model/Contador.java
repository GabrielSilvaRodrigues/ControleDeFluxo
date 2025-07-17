package br.com.dio.model;

public class Contador {
    private int parametroUm;
    private int parametroDois;

    public Contador(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public Contador() {
    }

    public int getParametroUm() {
        return parametroUm;
    }

    public void setParametroUm(int parametroUm) {
        this.parametroUm = parametroUm;
    }

    public int getParametroDois() {
        return parametroDois;
    }

    public void setParametroDois(int parametroDois) {
        this.parametroDois = parametroDois;
    }

    public void contar() {
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo número " + (i - parametroUm + 1) + ": " + i);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.parametroUm;
        hash = 43 * hash + this.parametroDois;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contador other = (Contador) obj;
        if (this.parametroUm != other.parametroUm) {
            return false;
        }
        return this.parametroDois == other.parametroDois;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contador{");
        sb.append("parametroUm=").append(parametroUm);
        sb.append(", parametroDois=").append(parametroDois);
        sb.append('}');
        return sb.toString();
    }

}
