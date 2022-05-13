package com.example.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PetContract() {
    }

    /**
     * Inner class that defines the table contents
     */
    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * possible values for the gender of the pets
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}