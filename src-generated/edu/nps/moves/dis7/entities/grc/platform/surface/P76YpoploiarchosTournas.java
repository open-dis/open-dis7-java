package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f0d96f2;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27523
 */
public class P76YpoploiarchosTournas extends EntityType
{
    /** Default constructor */
    public P76YpoploiarchosTournas()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23370, Light/Patrol Craft
        setSubCategory((byte)2); // uid 27518, Tiger Class (Type 148)
        setSpecific((byte)5); // uid 27523, P76 Ypoploiarchos Tournas
    }
}
