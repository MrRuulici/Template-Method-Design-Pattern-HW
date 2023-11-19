abstract  class PageTemplate {

	public final void renderPage() {
		 renderHeader();
	     renderContent();
	     renderFooter();
	}
	
	protected abstract void renderHeader();
    protected abstract void renderContent();
    protected abstract void renderFooter();
	
}
