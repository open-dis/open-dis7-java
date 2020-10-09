package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22356acd
 * Country: Greece (GRC)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27553
 */
public class P64Eleftheria extends EntityType
{
    public P64Eleftheria()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27549, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27550, Thetis Class (Type 420)
        setSpecific((byte)3); // uid 27553, P-64 Eleftheria
    }
}
