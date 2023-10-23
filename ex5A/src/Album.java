public class Album {
    private final String titre, nomArtiste, paysArtiste, label, marqueDisque, producteur, version, genre;
    private final int anneeParution, anneeParutionOriginal, debitStandard, debitAbonne;
    private final boolean albumRemasterise;

    public Album(Builder builder) {
        this.titre = builder.titre;
        this.nomArtiste = builder.nomArtiste;
        this.paysArtiste = builder.paysArtiste;
        this.label = builder.label;
        this.marqueDisque = builder.marqueDisque;
        this.producteur = builder.producteur;
        this.version = builder.version;
        this.genre = builder.genre;
        this.anneeParution = builder.anneeParution;
        this.albumRemasterise = builder.albumRemasterise;
        this.anneeParutionOriginal = builder.anneeParutionOriginal;
        this.debitStandard = builder.debitStandard;
        this.debitAbonne = builder.debitAbonne;
    }

    public static class Builder {
        private final String titre, nomArtiste;
        private String paysArtiste, label, marqueDisque, producteur, version, genre;
        private int anneeParution, anneeParutionOriginal, debitStandard, debitAbonne;
        private boolean albumRemasterise;

        public Builder(String titre, String nomArtiste) {
            this.titre = titre;
            this.nomArtiste = nomArtiste;
        }

        public Builder paysArtiste(String paysArtiste) {
            this.paysArtiste = paysArtiste;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder marqueDisque(String marqueDisque) {
            this.marqueDisque = marqueDisque;
            return this;
        }

        public Builder producteur(String producteur) {
            this.producteur = producteur;
            return this;
        }

        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder anneeParution(int anneeParution) {
            this.anneeParution = anneeParution;
            return this;
        }

        public Builder albumRemasterise(boolean albumRemasterise) {
            this.albumRemasterise = albumRemasterise;
            return this;
        }

        public Builder anneeParutionOriginal(int anneeParutionOriginal) {
            this.anneeParutionOriginal = anneeParutionOriginal;
            return this;
        }

        public Builder debitStandard(int debitStandard) {
            this.debitStandard = debitStandard;
            return this;
        }

        public Builder debitAbonne(int debitAbonne) {
            this.debitAbonne = debitAbonne;
            return this;
        }

        public Album build() {
            return new Album(this);
        }
    }
}
