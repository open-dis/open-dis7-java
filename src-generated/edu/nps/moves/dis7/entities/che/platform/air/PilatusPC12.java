package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@623dcf2a;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29218
 */
public class PilatusPC12 extends EntityType
{
    /** Default constructor */
    public PilatusPC12()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29209, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)21); // uid 29217, Single Engine Turboprop
        setSpecific((byte)1); // uid 29218, Pilatus PC-12
    }
}
