using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Kish_Site.Pages;

public class PlacesModel : PageModel
{
    private readonly ILogger<PlacesModel> _logger;

    public PlacesModel(ILogger<PlacesModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {

    }
}
