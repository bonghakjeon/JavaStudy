public class WikiPageResponder implements SecureResponder {
    protected WikiPage page;
    protected PageData pageData;
    protected String pageTitle;
    protected Request request;
    protected PageCrawler PageCrawlerImpl
    
    public Response makeResponse(FitnesseContext context, Request request) throws Exception {
        String pageName = getPageNameOrDefault(request, "FrontPage");
        loadPage(pageName, context);
        if (page == null)
            return notFoundResponse(context, request);
        else
            return makePageResponse(context, request);

        private String getPageNameOrDefault(Request request, String defaultPageName) {
            String pageName = request.getResource();
            if (StringUtil.isBlank(pageName))
                pageName = defaultPageName;

            return pageName;
        }

        protected void loadPage(String resource, FitnesseContext context) throws Exception {
            WikiPagePath path = PathParser.parse(resource);
            crawler = context.root.getPageCrawler();
            crawler.setDeadEndStrategy(new VirtualEnabledPageCrawler());
            page = crawler.getPage(context.root, path);
            if (page != null)
                pageData = page.getData();
        }

        private Response notFoundResponse(FitnesseContext context, Request request) throws Exception {
            return new NotFoundResponder().makeResponse(context, request);
        }

        private SimpleResponse makePageResponse(FitnesseContext context) throws Exception {
            pageTitle = PathParser.render(crawler.getFullPath(page));
            String html = makeHtml(context);

            SimpleResponse response = new SimpleResponse();

            response.setMaxAge(0);
            response.setContent(html);
            return response;
        }
    }
}
