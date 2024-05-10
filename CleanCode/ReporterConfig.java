
// TODO : VSCode에서 자바 실행할 수 있도록 설치 완료 (2023.11.15 jbh)
// 참고 URL - https://youtu.be/5VrMVSDjeso?si=1A1NYK9tJ3w-O5tR

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class ReporterConfig {
    private String m_ClassName;
    private List<Property> m_properties = new ArrayList<Property>();

    public void addProperty(Property property) {
        m_properties.add(property);
    }
}

public class GuessStatisticsMessage {
    private String number;
    private String verb;
    private String pluralModifier;

    public String make(char candidate, int count) {
        createPluralDependentMessageParts(count);
        return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
    }

    private void createPluralDependentMessageParts(int count) {
        if (count == 0) {
            thereAreNoLetters();
        }
        else if (count == 1) {
            thereIsOneLetter();
        }
        else {
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(int count) {
        number = Integer.toString(count);
        verb = "are";
        pluralModifier = "s";
    }

    private void thereIsOneLetter() {
        number = "1";
        verb   = "is";
        pluralModifier = "";
    }

    private void thereAreNoLetters() {
        number = "no";
        verb = "are";
        pluralModifier = "s";
    }
}

class TestPart {
    private String m_dsc;  // 설명 문자열 
    void SetName (String name) {
        m_dsc = name;
    }
}

class Part {
    String description;
    void setDescription(String description) {
        this.description = description;
    } 
}

class Customer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
    /* . . . */
}

class Cell {
    // TODO : Java 크기 할당 & 초기화 없이 배열 참조변수만 선언 (2023.11.16 jbh)
    // 참고 URL - https://ifuwanna.tistory.com/231
    private int[] arr;

    // TODO : Java 인스턴스 메서드 "IsFlagged" 구현 (2023.11.16 jbh)
    // 참고 URL - https://88240.tistory.com/440
    boolean IsFlagged() {
        return true;
    }
}

class Test {
    private int elapsedTimeInDays;
    private int daysSinceCreation;
    private int daysSinceModification;
    private int fileAgeInDays;

    private int realDaysPerIdealDay = 4;

    // TODO : const 역할과 비슷한 static final 상수 선언 (2023.11.29 jbh)
    // 참고 URL - https://sslblog.tistory.com/23
    private static final int NUMBER_OF_TASKS = 5;
    private static final int WORK_DAYS_PER_WEEK = 5;
    private static int sum = 0;
    private static int taskEstimate = new int();

    PhoneNumber phoneString;

    // TODO : static final 사용해서 상수 선언 (2023.11.16 jbh)
    // 참고 URL - https://velog.io/@tjddus0302/Java-%EC%83%81%EC%88%98%EB%8A%94-%EC%99%9C-static-final%EB%A1%9C-%EC%84%A0%EC%96%B8%ED%95%A0%EA%B9%8C
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    public List<Cell> gameBoard = new ArrayList<Cell>();

    void monad(Integer. . . args);
    void dyad(String name, Integer. . . args);
    void triad(String name, int count, Integer. . . args);

    MockRequest request;
    private final String HTTP_DATE_REGEXP = "[SMTWF] [a-z]{2}\\,S[0-9]{2}\\s[JFMASOND][a-z]{2}\\s" + "[0-9]{4}\\s[0-9]{2}\\:[0-9]{2}\\sGMT";

    private Response response;
    private FitnesseContext context;
    private FileResponder responder;
    private Locale saveLocale;
    // Example: "Tue, 02 Apr 2003 22:18:49 GMT"

    public static void main(String[] args) {
        System.out.println("HELLO WORLD JAVA");
        
        if (employee.isEligibleForFullBenefits())


        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays  = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskDays;

            String name = employee.getName();
            customer.setName("mike");
            if (payCheck.isPosted())  . . . 
        }

        // 테스트 중인 Responder 인스턴스를 반환한다.
        protected abstract Responder responderInstance();

        // kk:mm:ss EEE, MMM dd, yyyy 형식이다.
        Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");

        // TODO : 정적 팩토리 메소드(C# static 메소드) Complex.FromRealNumber(23.0);
        Complex fulcrumPoint = Complex.FromRealNumber(23.0); 

        float hours = 20.50f;
        String name = "Test";
        String test = String.format("%s worked %.2f hours", name, hours);
        
        // public String format(String format, Object... args)

        if (attributeExists("username")) {
            setAttribute("username", "unclebob");
        }

        if (deletePage(page) == E_OK) {

        }

        String listItemContent = match.group(3).trim();
        // 여기서 trim은 정말 중요하다. trim 함수는 문자열에서 시작 공백을 제거한다.
        // 문자열에 시작 공백이 있으면 다른 문자열로 인식되기 때문이다.
        new ListItemmWidget(this, listItemContent, this.level + 1);
        return buildList(text.substring(mmatch.end()));
    }

    public List<Cell> getThem() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
          if (cell.IsFlagged())
            flaggedCells.add(cell);
        return flaggedCells;
    }

    public static void copyChars (char source[], char destination[]) 
    {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    // 테스트 중인 Responder 인스턴스를 반환한다.
    protected abstract Responder responder();

    public int compareTo(Object o) {
        if (o instanceof WikiPagePath) {
            WikiPagePath p = (WikiPagePath) o;
            String compressedName = StringUtil.join(names, "");
            String compressedArgumentName = StringUtil.join(p.names, "");
            return compressedName.compareTo(compressedArgumentName);
        }
        return 1;  // 옳은 유형이므로 정렬 순위가 더 높다.
    }

    public void testConcurrentAddWidgets() throws Exception {
        WidgetBuilder wigetBuilder = new WidgetBuilder(new Class[]{BoldWidget.class});
        String text = "'''bold text'''";
        ParentWidget parent = new BoldWidget(new MockWidgetRoot(), "'''bold text'''");
        AtomicBoolean failFlag = new AtomicBoolean();
        failFlag.set(false);

        // 스레드를 대량 생성하는 방법으로 어떻게든 경쟁 조건을 만들려 시도한다.
        for (int i = 0; i < 25000; i++) {
            WidgetBuilderThread widgetBuilderThread = 
                new WidgetBuilderThread(widgetBuilderThread, text, parent, failFlag);
            Thread thread = new Thread(widgetBuilderThread);
            thread.start();
        }
        assertEquals(false, failFlag.get());
    }

    public void testCompareTo() throws Exception {
        WikiPagePath a  = PathParser.parse("PageA");
        WikiPagePath ab = PathParser.parse("PageA.PageB");
        WikiPagePath b  = PathParser.parse("PageB");
        WikiPagePath aa = PathParser.parse("PageA.PageA");
        WikiPagePath bb = PathParser.parse("PageB.PageB");
        WikiPagePath ba = PathParser.parse("PageB.PageA");

        assertTrue(a.compareTo(a) == 0);     // a == a 
        assertTrue(a.compareTo(b) != 0);     // a != b
        assertTrue(ab.compareTo(ab) == 0);   // ab == ab
        assertTrue(a.compareTo(b) == -1);    // a < b 
        assertTrue(aa.compareTo(ab) == -1);  // aa < ab
        assertTrue(ba.compareTo(bb) == -1);  // ba < bb
        assertTrue(b.compareTo(a) == 1);     // b > a
        assertTrue(ab.compareTo(aa) == 1);   // ab > aa
        assertTrue(bb.compareTo(ba) == 1);   // bb > ba
    }

    public static SimpleDateFormat makeStandardHttpDateFormat() {
        // SimpleDateFormat은 스레드에 안전하지 못하다.
        // 따라서 각 인스턴스를 독립적으로 생성해야 한다.
        SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df;
    }

    // TODO - MdM 현재 필요하지 않다.
    // 체크아웃 모델을 도입하면 함수가 필요 없다.
    protected VersionInfo makeVersion() throws Exception {
        return null;
    }

    public void loadProperties() {
        try {
            String propertiesPath = propertiesLocation + "/" + PROPERTIES_FILE;
            FileInputStream properties propertiesStream = new FileInputStream(propertiesPath);
            loadedProperties.load(propertiesStream);
        }
        catch (IOException ex) {
            // 속성 파일이 없다면 기본 값을 모두 메모리로 읽어 들였다는 뜻이다.
        }
    }

    public synchronized void waitForClose(final long timeoutMillis) throws Exception {
        if (false == closed) {
            wait(timeoutMillis);
            if (false == closed) 
                throw new Exception("MockResponseSender could not be closed!");
        }
    }

    private void startSending() {
        try {
            doSending();
        }
        catch (SocketException e) {
            // 정상. 누군가가 요청을 멈췄다.
        }
        catch (Exception e) {
            addExceptionAndCloseResponse(e);
        }
    }

    private void addExceptionAndCloseResponse(Exception e) {
        try {
            response.add(ErrorResponder.makeExceptionString(e));
            response.closeAll();                
        }
        catch (Exception e1) {

        }
    }

    private void measureLine(String line) {
        lineCount++;
        int lineSize = line.length();
        totalChars   += lineSize;
        lineWidthHistogram.addLine(lineSize, lineCount);
        recordWidestLine();
    }
}

class HtmlUtil {
    // public static String renderPageWithSetupsAndTeardowns (PageData pageData, boolean isSuite)
    // throws Exception {
    //     boolean isTestPage = pageData.hasAttribute("Test");

    //     if (isTestPage) {
    //         WikiPage testPage = pageData.getWikiPage();
    //         StringBuilder newPageContent = new StringBuffer();
    //         includeSetupPages(testPage, newPageContent, isSuite);
    //         newPageContent.append(pageData.getContent());
    //         includeTeardownPages(testPage, newPageContent, isSuite);
    //         pageData.setContent(newPageContent.toString()); 
    //     }
    //     return pageData.getHtml();
    // } 
    public static String renderPageWithSetupsAndReardowns (PageData pageData, boolean isSuite) 
    throws Exception {
        if (isTestPage(pageData))
            includeSetupAndTeardownPages(pageData, isSuite);
        return pageData.getHtml();
    }
}

class Footer {
    public void appendFooter(StringBuffer report) {

    }

    // public void delete() {
    //     try {
    //         deletePage(page);
    //         registry.deleteReference(page.name);
    //         configKeys.deleteKey(page.name.makeKey());
    //     }
    //     catch (Exception e) {
    //         logger.log(e.getMessage());
    //     }
    // }

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }

    private void logError(Exception e) {
        logger.log(e.getMessage());
    }
}

class JUnit {

    private static void readPreferences() {
        InputStream is = null;
        try {
            is = new FileInputStream(getPreferencesFile());
            setPreferences(new Properties(getPreferences()));
            getPreferences().load(is);
        }
        catch (IOException e) {
            try {

            } catch (IOException e1) {

            }
        }
    }
    
    public int countTestCases() {
        int count = 0;
        for (Test each : tests)
            count += each.countTestCases();
        return count;
    }

    public void test() {
        // . . .
        for (XmlTest test : m_suite.getTests()) {
            TestRunner tr = m_runnerFactory.newTestRunner(this, test);
            tr.addListner(m_textReporter);
            m_testRunners.add(tr);

            invoker = tr.getInvoker();

            for (ITestNGMethod m : tr.getBeforeSuiteMethods()) {
                getBeforeSuiteMethods.put(m.getMethod(), m);
            }

            for (ITestNGMethod m : tr.getAfterSuiteMethods()) {
                afterSuiteMethods.put(m.getMethod(), m);
            }
        } 

        // . . .
        while(dis.read(buf, 0, readBufferSize) != -1)
        ;
    }

    public class TestSuite implements Test {
        // region 프로퍼티
        private String fName; 

        private Vector<Test> fTests = new Vector<Test>(10);

        // endregion 프로퍼티

        static public Test createTest(Class<? extends TestCase> theClass, String name) {
            // . . . 
        }

        public static Constructor<? extends TestCase>
        getTestConstructor(Class<? extends TestCase> theClass) throws NoSuchMethodError {
            // . . . 
        }

        public static Test warning(final String message) {
            // . . . 
        }

        private static String exceptionToString(Throwable t) {
            // . . . 
        }

        // region 생성자 
        public TestSuite() {
            // . . . 
        }

        public TestSuite(final Class<? extends TestCase theClass>) {
            // . . . 
        }

        public TestSuite(Class<? extends TestCase> theClass, String name) {
            // . . . 
        }

        // endregion 생성자

        // ... ... ... ... ...
    }
}