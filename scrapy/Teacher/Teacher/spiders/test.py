import scrapy


class TestSpider(scrapy.Spider):
    name = 'test'
    allowed_domains = ['www.itcast.cn']
    start_urls = ['http://www.itcast.cn/']

    def parse(self, response):
        pass
