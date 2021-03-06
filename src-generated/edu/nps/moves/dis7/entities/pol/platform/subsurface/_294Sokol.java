package edu.nps.moves.dis7.entities.pol.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26a529dc;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23041
 */
public class _294Sokol extends EntityType
{
    /** Default constructor */
    public _294Sokol()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23037, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 23040, Sokol Class
        setSpecific((byte)1); // uid 23041, 294 Sokol
    }
}
