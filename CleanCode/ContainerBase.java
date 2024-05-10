import java.io.Serializable;

public class ContainerBase implements Container, Lifecycle, PipeLine, MBeanRegistration, Serializable {
    
    protected int backgroundProcessorDelay = -1;

    protected LifecycleSupport lifecycle = new LifecycleSupport(this);

    protected ArrayList listeners = new ArrayList();

    protected Loader loader = null;

    protected Log logger = null;

    protected String logName = null;

    protected Manager manager = null;

    protected Cluster cluster = null;

    protected String name = null;

    protected Container parent = null;

    protected ClassLoader parentClassLoader = null;

    protected PipeLine pipeLine = new StandardPipeLine(this);

    protected Realm realm = null;

    protected DirContext resources = null;

    
}
