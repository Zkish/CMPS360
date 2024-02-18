using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Kish_Site.Pages;

public class ActivitesModel : PageModel
{
    private readonly ILogger<ActivitesModel> _logger;

    public ActivitesModel(ILogger<ActivitesModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {

    }
}
