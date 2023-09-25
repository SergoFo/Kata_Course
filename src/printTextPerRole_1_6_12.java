public class printTextPerRole_1_6_12 {
    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder sbTextPerRole = new StringBuilder();
        StringBuilder sbRole = new StringBuilder();
        StringBuilder sbText = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {                      // for (String role : roles) {
            String role = roles[i];
            sbRole.append(role).append(":");
            sbTextPerRole.append(sbRole).append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(sbRole.toString())) {
                    textLines[j] = textLines[j].replaceFirst(sbRole.toString(), "");
                    sbText.append(j + 1).append(")").append(textLines[j]);
                    sbTextPerRole.append(sbText).append("\n");
                    sbText.setLength(0);
                }
            }
            sbTextPerRole.append("\n");
            sbRole.setLength(0);
        }
        System.out.println(sbTextPerRole);                      //Убрать sout
        return sbTextPerRole.toString();
    }
}


/*
        StringBuilder sbTextPerRole = new StringBuilder();
        StringBuilder sbText = new StringBuilder();
        StringBuilder sbRole = new StringBuilder();

        for (int j = 0; j < roles.length; j++) {                        // for (String role : roles) {
            String role = roles[j];
            sbRole.append(role).append(":");
            sbTextPerRole.append(sbRole).append("\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(sbRole.toString())){
                    textLines[i] = textLines[i].replaceFirst(sbRole.toString(), "");
                    sbText.append(i + 1).append(")").append(textLines[i]);
                    sbTextPerRole.append(sbText).append("\n");
                    sbText.setLength(0);
                }
            }
            sbTextPerRole.append("\n");
            sbRole.setLength(0);
        }
        System.out.println(sbTextPerRole);
        return sbTextPerRole.toString();
    }
}*/


/*        for (int i = 0; i < roles.length; i++) {
            if (roles[i].startsWith("Городничий")) {
                int numbers = 0;
                for (int k = 0; k < textLines.length; k++) {
                    numbers++;
                    if (textLines[k].startsWith("Городничий")) {
                        int indexNew = 0;
                        textLines[indexNew] = textLines[k];
                        String replika = textLines[indexNew].replaceAll("Городничий: ", "");
                        indexNew++;
*//*                        if (indexNew == 1) {
                            BuilderGOROD.append("\n").append(roles[i]).append(":\n").append(numbers).append(") ").append(replika).append("\n");
                        } else {
                            BuilderGOROD.append(textLines[indexNew]);
                        }*//*
                        System.out.println(indexNew);
                    }
                }

            }

        }            return Arrays.toString(roles);
    }
}*/

/*
/n + роль + : + /n + номер + ) + пробел + текст реплики + /n
        BuilderGOROD.append("\n").append(roles[i]).append(":\n").append(numbers).append(") ").append(textLines[i]).append("\n");
*/
/*            if (textLines[i].startsWith("Аммос Федорович")) {
                String delete1 = textLines[i].replaceAll("Аммос Федорович: ", numbers + ") ");
                System.out.println(delete1);
        }*/

