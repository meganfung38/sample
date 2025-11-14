public class TestNested {

    private InnerA a;   // dependency on InnerA

    public TestNested() {
        a = new InnerA();
    }

    public void run() {
        a.doThing();
    }

    // ---------- NESTED CLASS ----------
    public class InnerA {
        public void doThing() {}
    }

    // ---------- NESTED INTERFACE ----------
    public interface InnerB {
        void inspect(TestNested t);   // dependency on TestNested
    }
}

