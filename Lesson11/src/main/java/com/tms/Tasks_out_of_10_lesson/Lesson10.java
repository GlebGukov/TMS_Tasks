package com.tms.Tasks_out_of_10_lesson;

import MyException.ExceptionOne;
import MyException.ExceptionTwo;
import MyException.ExpentionThree;

public class Lesson10 {
    public static void formABC(String name) {
        int r =name.length();
        boolean i = r == 22;
        boolean b = name.contains("abc") || name.contains("ABC");
        try {
            if (name.isBlank() || name.isEmpty()) {
                throw new ExceptionOne();
            }
            if (!i){
                throw new ExceptionTwo();

            }
            if (b){
                System.out.println("В названии есть совпадение ABC, abc");
            }
            if (!b){
                throw new ExpentionThree();
            }
        }
        catch (ExceptionOne one){
            System.out.println(one.getMessage());
        }
        catch (ExceptionTwo two){
            System.out.println(two.getMessage());
        } catch (ExpentionThree three) {
            System.out.println(three.getMessage());
        }
    }


        public static void form555 (String name){
//        - Проверить начинается ли номер документа с последовательности
//        555.;
            int r = name.length();
            boolean i = r == 22;
            boolean b = name.startsWith("555");
            try {
                if (name.isBlank() || name.isEmpty()) {
                    throw new ExceptionOne();
                }
                if (!i){
                    throw new ExceptionTwo();
                }
                if (b){
                    System.out.println("В названии есть совпадение c числом 555");
                }
                if (!b){
                    throw new ExpentionThree();
                }
            }
            catch (ExceptionOne one){
                System.out.println(one.getMessage());
            }
            catch (ExceptionTwo two){
                System.out.println(two.getMessage());
            } catch (ExpentionThree three) {
                System.out.println(three.getMessage());;
            }
        }

        public static void form1a2b (String name){
            int r = name.length();
            boolean i = r == 22;
            boolean b = name.endsWith("1a2b");
            try {
                if (name.isBlank() || name.isEmpty()) {
                    throw new ExceptionOne();
                }
                if (!i){
                    throw new ExceptionTwo();
                }
                if (b){
                    System.out.println("В названии есть совпадение c 1a2b");
                }
                if (!b){
                    throw new ExpentionThree();
                }
            }
            catch (ExceptionOne one){
                System.out.println(one.getMessage());
            }
            catch (ExceptionTwo two){
                System.out.println(two.getMessage());
            } catch (ExpentionThree three) {
                System.out.println(three.getMessage());;
            }
        }

    }
