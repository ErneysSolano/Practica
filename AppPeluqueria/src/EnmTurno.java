public enum EnmTurno {

    T1("6:00 - 7:30"),
    T2("7:45 - 9:00"),
    T3("9:15 - 10:45"),
    T4("11:00 - 12:30"),
    T5("14:00 - 15:30"),
    T6("15:45 - 17:15"),
    T7("17:30 - 19:00"),
    T8("19:15 - 20:30");

    private final String horario;

    EnmTurno(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }
}
