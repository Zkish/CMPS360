using System.Xml.Serialization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Kish_Site.Pages;

public class AboutModel : PageModel
{
    private readonly ILogger<AboutModel> _logger;

    public AboutModel(ILogger<AboutModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {
        // put all your code in here.
        string Back = "About";
        string helloWorld = "Hello World";
        ViewData["Back"] = Back = "Here is some Backend Code Pulled to The Front: " + helloWorld;
    }
}
