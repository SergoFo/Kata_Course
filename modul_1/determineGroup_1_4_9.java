public class determineGroup_1_4_9 {
    public int determineGroup(int age) {
/*      if (age <= 65 && age >=18 ) {
            return 3;
        } else if (age <= 17 && age >= 14) {
            return 2;
        } else if (age <= 13 && age >= 7) {
            return 1;
        } else if (age > 65) {
            return -1;
        }
        return age;
        */


/*
        if ((age >= 7 && age <= 13)) {
            return 1;
        } else {
            if ((age >= 14 && age <= 17)) {
                return 2;
            } else {
                if ((age >= 18 && age <= 65)) {
                    return 3;
                } else {
                    if (age > 65) return -1;
                }
            }
        }
        return age;
*/


        return age >= 7 && age <= 13 ? 1 : age >= 14 && age <= 17 ? 2 : age >= 18 && age <= 65 ? 3 : age > 65 ? -1 : 0;
    }
}






