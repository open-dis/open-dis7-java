package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dd31157;
 * Country: United Arab Emirates (ARE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18702
 */
public class P4502Marban extends EntityType
{
    /** Default constructor */
    public P4502Marban()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18692, Light/Patrol Craft
        setSubCategory((byte)3); // uid 18700, Ban Yas (Lurssen TNC 45) Class (fast attack craft-missile)
        setSpecific((byte)2); // uid 18702, P4502 Marban
    }
}
