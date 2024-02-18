using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Kish_Site.Pages;

public class PhotosModel : PageModel
{
    private readonly ILogger<PhotosModel> _logger;

    public PhotosModel(ILogger<PhotosModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {
        // put all your code in here.
        // string Brand = "Photos";
        // int yearStarted = 2003;
        // ViewData["Brand"] = Brand + " Established " + yearStarted;
    }
}
