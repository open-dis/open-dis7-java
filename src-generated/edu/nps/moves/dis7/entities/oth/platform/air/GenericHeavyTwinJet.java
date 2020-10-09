package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5b989dc7
 * Country: Other
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 24713
 */
public class GenericHeavyTwinJet extends EntityType
{
    public GenericHeavyTwinJet()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)88); // uid 24712, Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 24713, Generic Heavy Twin Jet
    }
}
