package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56f2bbea;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31688
 */
public class RosomakM1wRIWSStinger extends EntityType
{
    /** Default constructor */
    public RosomakM1wRIWSStinger()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 31683, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 31684, KTO Rosomak IFV
        setSpecific((byte)4); // uid 31688, Rosomak M1 w/RIWS (Stinger)
    }
}
