package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@12d5c30e;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29249
 */
public class An140100 extends EntityType
{
    /** Default constructor */
    public An140100()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 29244, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)22); // uid 29245, Twin Engine Turboprop
        setSpecific((byte)1); // uid 29246, Antonov An-140
        setExtra((byte)3); // uid 29249, An-140-100
    }
}
