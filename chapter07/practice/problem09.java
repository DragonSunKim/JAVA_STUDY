package practice;

// Coding By 김용선.

class Hotel {

    class Room {
        int num;
        String name;

    }

    Room[] r = new Room[10];

    void add(int room_num, String name) {
        Room room = new Room();
        room.num = room_num;
        room.name = name;

        r[room_num - 1] = room;
    }

    void show() {
        for (Room r : r) {
            if (r != null)
                System.out.println(r.num + "번 방을 " + r.name + "가 예약했습니다.");
        }
    }
}

public class problem09 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.add(5, "호돌이");
        hotel.add(7, "길동이");
        hotel.show();
    }
}
