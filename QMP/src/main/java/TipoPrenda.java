public enum TipoPrenda {
  REMERA {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTE_SUPERIOR;
    }
  },
  CHOMBA {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTE_SUPERIOR;
    }
  },
  CAMISA {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTE_SUPERIOR;
    }
  },
  ZAPATILLA {
    @Override
    public Categoria getCategoria() {
      return Categoria.CALZADO;
    }
  },
  ZAPATO {
    @Override
    public Categoria getCategoria() {
      return Categoria.CALZADO;
    }
  },
  PANTALON {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTE_INFERIOR;
    }
  },
  SHORT {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTE_INFERIOR;
    }
  },
  CAMPERA {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTE_SUPERIOR;
    }
  },
  PANUELO {
    @Override
    public Categoria getCategoria() {
      return Categoria.ACCESORIO;
    }
  },
  ANTEOJOS {
    @Override
    public Categoria getCategoria() {
      return Categoria.ACCESORIO;
    }
  };

  public abstract <E> Enum<Categoria> getCategoria();
}
