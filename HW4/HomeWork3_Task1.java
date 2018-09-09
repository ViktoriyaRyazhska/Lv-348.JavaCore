package third_lesson;

import java.util.Scanner;

public class HomeWork3_Task1 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        float number;
        int num1;
        int num2;
        int num3;
        int hError;

        System.out.print("Please enter 1 number for checking off belonging its to the range [-5,5]: ");
        number = in.nextFloat();
        System.out.println(range(number));

        System.out.print("Please enter first NUM: ");
        num1 = in.nextInt();
        System.out.print("Please enter second NUM: ");
        num2 = in.nextInt();
        System.out.print("Please enter third NUM: ");
        num3 = in.nextInt();

        getMaxMin(num1, num2, num3);

        httpError errorHttp;
        System.out.print("Please enter number of HttpError(400,401,...,410): ");
        hError = in.nextInt();

        switch (hError) {
            case 400:
                System.out.println("400 - " + (errorHttp = httpError.BAD_REQUEST));
                break;
            case 401:
                System.out.println("401 - " + (errorHttp = httpError.UNAUTHORIZED));
                break;
            case 402:
                System.out.println("402 - " + (errorHttp = httpError.PAYMENT_REQUIRED));
                break;
            case 403:
                System.out.println("403 - " + (errorHttp = httpError.FORBIDDEN));
                break;
            case 404:
                System.out.println("404 - " + (errorHttp = httpError.NOT_FOUND));
                break;
            case 405:
                System.out.println("405 - " + (errorHttp = httpError.METHOD_NOT_ALLOWED));
                break;
            case 406:
                System.out.println("406 - " + (errorHttp = httpError.NOT_ACCEPTABLE));
                break;
            case 407:
                System.out.println("407 - " + (errorHttp = httpError.PROXY_AUTHENTICATION_REQUIRED));
                break;
            case 408:
                System.out.println("408 - " + (errorHttp = httpError.REQUEST_TIMEOUT));
                break;
            case 409:
                System.out.println("409 - " + (errorHttp = httpError.CONFLICT));
                break;
            case 410:
                System.out.println("410 - " + (errorHttp = httpError.GONE));
                break;
            default:
                System.out.println("Error");
        }
    }

    public static boolean range(float number) {
        return (number >= -5 && number <= 5) ? true : false;
    }

    public static void getMaxMin(int num1, int num2, int num3) {
        int max = 0;
        int min = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
                if (num2 > num3) {
                    min = num3;
                } else {
                    min = num2;
                }
            } else {
                min = num2;
                max = num3;
            }
        } else if (num2 > num3) {
            max = num2;
            if (num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        }
        System.out.println("MAX: " + max + ", MIN: " + min);
    }

    public enum httpError {
        BAD_REQUEST,
        UNAUTHORIZED,
        PAYMENT_REQUIRED,
        FORBIDDEN,
        NOT_FOUND,
        METHOD_NOT_ALLOWED,
        NOT_ACCEPTABLE,
        PROXY_AUTHENTICATION_REQUIRED,
        REQUEST_TIMEOUT,
        CONFLICT,
        GONE
    }
}
