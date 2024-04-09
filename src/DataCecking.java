public class DataCecking {
//    String[] data;
//
//    public DataCecking(String[] data) {
//        this.data = data;
//    }

    public void dataCheck(String[] data) {
        if (data.length < 6) {
            throw new RuntimeException("Введены неверное количество данных (< 6)");
        } else if (data.length > 6) {
            throw new RuntimeException("Введены неверное количество данных (> 6)");
        }

    }

    public void dateCheck(String date) {
        String[] temp = date.split("\\.");
        try {
            for (String s : temp) {
                Integer.parseInt(s);
            }
            if (!date.matches("\\d{2}.\\d{2}.\\d{4}")) {
                throw new RuntimeException("Введён неверный формат даты  - не соответствует формату дд.мм.гггг");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат даты - дата должна быть записана цифрами в формате дд.мм.гггг");
            e.printStackTrace();

        }

    } // проверка даты рождения

    public void isPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 11 || phoneNumber.charAt(0) != '8' || phoneNumber.length() > 11)
            throw new RuntimeException("Номер телефона должен стостоять из 11 цифр");
        try {
            Long.parseLong(phoneNumber);

        } catch (NumberFormatException e) {
            System.out.println("В номере телефона должны быть только цифры");
            e.printStackTrace();

        }

    }// проверка номера телефона

    public void isWriteGender(String gender) {
        if (!gender.equals("f") & !gender.equals("m") & !gender.equals("o")) {
            throw new RuntimeException("Неверный формат пола");

        }
    }// проверка пола

    public void checkAll(String[] data) {
        dataCheck(data);
        dateCheck(data[3]);
        isPhoneNumber(data[4]);
        isWriteGender(data[5]);
    }
}
