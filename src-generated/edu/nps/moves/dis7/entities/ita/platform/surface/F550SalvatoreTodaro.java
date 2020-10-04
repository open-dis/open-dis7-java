package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@773cbf4f
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18634
 */
public class F550SalvatoreTodaro extends EntityType
{
    public F550SalvatoreTodaro()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18601, Frigate (including Corvette)
        setSubCategory((byte)6); // uid 18633, De Cristofaro class
        setSpecific((byte)1); // uid 18634, F 550 Salvatore Todaro
    }
}