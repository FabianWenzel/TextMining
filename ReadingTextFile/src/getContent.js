var request = require('sync-request');
var xml2js = require('xml2js');
var Twitter = require('twitter');

// Just a small programm to extract content from a news site
var rssFeeds = [
    "http://www.spiegel.de/politik/deutschland/horst-seehofer-beendet-willkommenskultur-kommentar-a-1091845.html"
];

var twitterFeeds = [
    "SPIEGELONLINE",
    "welt",
    "focusonline",
    "SZ",
    "zeitonline"
];

 var rssLink = rssFeeds[0];
    console.log("start crawling: " + rssLink);
    var rssContent = crawlFeed(rssLink);

// ------- Crawl Function, gets the body from the webpage -------
function crawlFeed(link) {
    var res = request('GET', link);
    return res.body.toString('utf-8');
}

// ------- Scrape all Links -------------

extractor = require('unfluff');
 
data = extractor.lazy(rssContent, 'en');

// Access whichever data elements you need directly. 
console.log(data.title());
console.log(data.text());

console.log(data.tags());
