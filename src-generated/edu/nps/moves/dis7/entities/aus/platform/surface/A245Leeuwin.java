package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cda1055
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29382
 */
public class A245Leeuwin extends EntityType
{
    public A245Leeuwin()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17594, Auxiliary
        setSubCategory((byte)7); // uid 29381, Leeuwin Class Survey Vessel
        setSpecific((byte)1); // uid 29382, A 245 Leeuwin
    }
}
