package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4adc663e;
 * Country: United Arab Emirates (ARE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18708
 */
public class P1101Ardana extends EntityType
{
    /** Default constructor */
    public P1101Ardana()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18692, Light/Patrol Craft
        setSubCategory((byte)4); // uid 18707, Ardhana Class (large patrol craft)
        setSpecific((byte)1); // uid 18708, P1101 Ardana
    }
}
