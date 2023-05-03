package br.com.zoo.enums;

public enum AnimalSound {

    BARK("Au au!"),
    MEOW("Miaaaau!"),
    HORROR_SOUND("Tantantantan"),
    BIRD_SINGING("Fififi"),
    REPTILE_SOUND("Pspsps");

    public String slug;

    AnimalSound(final String slug) {
        this.slug = slug;
    }

    public String getSlug() {
        return slug;
    }
}
