 class Booking {
    private int spaceIndex;
    private String carInfo;
    private String paymentInfo;
    private int duration;
    private double totalCost;
    private double deposit;
    private String email;
    private long bookingTime;

    public Booking(int spaceIndex, String carInfo, String paymentInfo, int duration, double totalCost, double deposit, String email) {
        this.spaceIndex = spaceIndex;
        this.carInfo = carInfo;
        this.paymentInfo = paymentInfo;
        this.duration = duration;
        this.totalCost = totalCost;
        this.deposit = deposit;
        this.email = email;
        this.bookingTime = System.currentTimeMillis();
    }

    public int getSpaceIndex() {
        return spaceIndex;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public int getDuration() {
        return duration;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getDeposit() {
        return deposit;
    }

    public String getEmail() {
        return email;
    }

    public long getBookingTime() {
        return bookingTime;
    }
}
