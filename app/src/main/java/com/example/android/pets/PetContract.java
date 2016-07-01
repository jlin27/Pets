/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.pets;

import android.provider.BaseColumns;

public class PetContract {

    public static final class PetEntry implements BaseColumns {

        // Constants to define table and columns
        public final static String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_TYPE = "type";
        public final static String COLUMN_PET_NAME ="name";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_AGE = "age";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_HEIGHT = "height";
        public final static String COLUMN_PET_WEIGHT = "weight";
        public final static String COLUMN_IMAGE_PATH = "image_path";
        public final static String COLUMN_STERILIZATION_STATUS = "status_status";
        public final static String COLUMN_ADDITIONAL_NOTES = "additional_notes";
        public final static String COLUMN_ADOPTION_STATUS = "adoption_status";

        public final static String[] TABLE_COLUMNS = {
                _ID ,
                COLUMN_PET_TYPE ,
                COLUMN_PET_NAME ,
                COLUMN_PET_GENDER ,
                COLUMN_PET_AGE ,
                COLUMN_PET_BREED ,
                COLUMN_PET_HEIGHT ,
                COLUMN_PET_WEIGHT ,
                COLUMN_IMAGE_PATH ,
                COLUMN_STERILIZATION_STATUS ,
                COLUMN_ADDITIONAL_NOTES ,
                COLUMN_ADOPTION_STATUS};
    }
}