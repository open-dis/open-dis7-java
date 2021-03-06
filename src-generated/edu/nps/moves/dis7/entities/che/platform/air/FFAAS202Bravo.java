package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71a06021;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29211
 */
public class FFAAS202Bravo extends EntityType
{
    /** Default constructor */
    public FFAAS202Bravo()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29209, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 29210, Single Piston Engine
        setSpecific((byte)1); // uid 29211, FFA AS 202 Bravo
    }
}
