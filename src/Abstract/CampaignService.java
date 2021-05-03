package Abstract;

import Entities.Concrete.Campaign;

public interface CampaignService {
	void add(Campaign campaign);

	void delete(Campaign campaign);

	void update(Campaign campaign);
}
