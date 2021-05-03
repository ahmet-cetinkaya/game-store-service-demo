package Concrete;

import Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(final Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya eklendi.");
	}

	@Override
	public void delete(final Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya silindi.");

	}

	@Override
	public void update(final Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya güncellendi.");
	}

}
