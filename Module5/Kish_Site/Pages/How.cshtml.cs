using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Kish_Site.Pages;

public class HowModel : PageModel
{
    private readonly ILogger<HowModel> _logger;

    public HowModel(ILogger<HowModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {

    }
}
